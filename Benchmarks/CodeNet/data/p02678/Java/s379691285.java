import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();


        List<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();
        for(int i=0; i<M; i++) {
            A.add(sc.nextInt());
            B.add(sc.nextInt());
        }

        int[][] dp = new int[N][2]; //0:times 1:room
        for(int i=1; i<N; i++) {
            dp[i][0] = Integer.MAX_VALUE/2;
        }

        Queue<Integer> targetRoomQueue = new ArrayDeque<>();
        Set<Integer> done = new HashSet<>();
        targetRoomQueue.add(1);
        while (true) {
            Integer targetRoom = targetRoomQueue.poll();
            done.add(targetRoom);
            if(targetRoom == null) {
                break;
            }

            int i = A.indexOf(targetRoom);

            while(i != -1) {
                if(dp[B.get(i)-1][0] > dp[targetRoom-1][0]+1) {
                    dp[B.get(i)-1][0] = dp[targetRoom-1][0]+1;
                    dp[B.get(i)-1][1] = targetRoom;
                    if(!done.contains(done)) {
                        targetRoomQueue.add(B.get(i));
                    }
                }

                A.remove(i);
                B.remove(i);
                i = A.indexOf(targetRoom);
            }

            i = B.indexOf(targetRoom);

            while(i != -1) {
                if(dp[A.get(i)-1][0] > dp[targetRoom-1][0]+1) {
                    dp[A.get(i)-1][0] = dp[targetRoom-1][0]+1;
                    dp[A.get(i)-1][1] = targetRoom;
                    if(!done.contains(done)) {
                        targetRoomQueue.add(A.get(i));
                    }
                }

                A.remove(i);
                B.remove(i);
                i = B.indexOf(targetRoom);
            }
        }

        System.out.println("Yes");
        for(int i=1; i<N; i++) {
            System.out.println(dp[i][1]);
        }
    }
}