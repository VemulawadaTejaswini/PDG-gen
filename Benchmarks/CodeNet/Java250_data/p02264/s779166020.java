import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Que {
    int head, tail, length;
    Node[] Narray;

    public Que(int inputN) {
        head = -1;
        tail = -1;
        length = inputN;
        Narray = new Node[inputN];
    }

    public void enQue(Node node) {
        tail += 1;
        Narray[tail % length] = node;
    }

    public Node deQue() {
        head += 1;
        return Narray[head % length];
    }

    public boolean isEmpty() {
        if (head == tail)
            return true;
        else
            return false;
    }
}

class Node {
    String pName;
    public int time;

    public Node(String pName, int time) {
        this.pName = pName;
        this.time = time;
    }
}

class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputData;
        String[] nodeData;

        try {
            int totalTime = 0;
            inputData = br.readLine().split(" ");
            int n = Integer.parseInt(inputData[0]);
            int limitTime = Integer.parseInt(inputData[1]);
            Que q = new Que(n);
            Node tmpNode = null;
            for (int i = 0; i < n; i++) {
                nodeData = br.readLine().split(" ");
                q.enQue(new Node(nodeData[0], Integer.parseInt(nodeData[1])));
            }
            while (!q.isEmpty()) {
                tmpNode = q.deQue();
                if (tmpNode.time <= limitTime) {
                    totalTime += tmpNode.time;
                    System.out.printf("%s %d\n", tmpNode.pName, totalTime);
                } else {
                    totalTime += limitTime;
                    tmpNode.time -= limitTime;
                    q.enQue(tmpNode);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
