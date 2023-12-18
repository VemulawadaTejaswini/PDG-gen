import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     * 0033 Ball
     */
    public static void main(String[] args) throws IOException {

        // Read All Hands
        List<BallQueue> ballQueueList = readBallQueueList();

        for (BallQueue ballQueue : ballQueueList) {
            // Judge a hand
            String result = ballQueue.judge();

            // Write a result
            System.out.println(result);
        }
    }

    /**
     * Read all input line and return the list of ball queue.
     *
     * @return List of BallQueue
     */
    protected static List<BallQueue> readBallQueueList() throws IOException {

        List<BallQueue> ballQueueList = new ArrayList<BallQueue>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                System.in));

        int count = Integer.parseInt(reader.readLine());
        // One line to one ball queue
        for (int i = 0; i < count; i++) {
            String[] splittedLine = reader.readLine().split(" ");
            int[] ballQueue = new int[10];
            for (int j = 0; j < ballQueue.length; j++) {
                ballQueue[j] = Integer.parseInt(splittedLine[j]);
            }
            ballQueueList.add(new BallQueue(ballQueue));
        }

        if (reader != null) {
            reader.close();
        }

        return ballQueueList;
    }

    /**
     * Ball class
     */
    static class BallQueue {

        /** ball array */
        int[] ballQueue;

        /**
         * Constructor
         *
         * @param ballQueue ball array
         */
        public BallQueue(final int[] ballQueue) {
            // Copy arguments to fields
            this.ballQueue = new int[ballQueue.length];
            System.arraycopy(ballQueue, 0, this.ballQueue, 0, ballQueue.length);
        }

        /**
         * Judge this ball queue.
         *
         * @return YES or NO
         */
        public String judge() {

            List<Integer> stackA = new ArrayList<Integer>();
            List<Integer> stackB = new ArrayList<Integer>();

            // Register first ball
            stackA.add(ballQueue[0]);

            // Try all branch
            boolean result = putBall(1, stackA, stackB);

            return result ? "YES" : "NO";
        }

        private boolean putBall(int index, List<Integer> stackA, List<Integer> stackB) {

            // If ball queue is over, result is YES
            if (index >= ballQueue.length) {
                return true;
            }

            // Try put ball on A
            if (ballQueue[index] > stackA.get(0)) {
                List<Integer> clonedStackA = deepCopy(stackA);
                clonedStackA.add(0, ballQueue[index]);
                if (putBall(index + 1, clonedStackA, stackB)) {
                    // Try recursively and if result is true, this return true
                    return true;
                }
            }

            // Try put ball on A
            if (stackB.size() == 0 || ballQueue[index] > stackB.get(0)) {
                List<Integer> clonedStackB = deepCopy(stackB);
                clonedStackB.add(0, ballQueue[index]);
                if (putBall(index + 1, stackA, clonedStackB)) {
                    // Try recursively and if result is true, this return true
                    return true;
                }
            }

            // Arriving at here means NO
            return false;
        }

        private static List<Integer> deepCopy(List<Integer> src) {
            List<Integer> dest = new ArrayList<Integer>();
            for (Integer value : src) {
                dest.add(value);
            }
            return dest;
        }
    }

}