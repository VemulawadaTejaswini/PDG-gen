// reference https://www.ipsj.or.jp/07editj/promenade/4506.pdf

import java.util.Arrays;
import java.util.Scanner;

class Node implements Comparable<Node> {
    int value;
    int place;

    Node(int value, int place) {
        this.value = value;
        this.place = place;
    }

    public int compareTo(Node n) {
        return value - n.value;
    }
}

public class Main {
    private static int sillysort(int m, int[] seq) {
        // initialize
        Node[] nodes = new Node[m];
        Node[] temp = new Node[m];
        for(int i = 0; i < m; i++) {
            temp[i] = new Node(seq[i], i);
        }
        Arrays.sort(temp);
        for(int i = 0; i < m; i++) {
            nodes[i] = new Node(-1, -1);
        }
        for(int i = 0; i < m; i++) {
            nodes[i].value = seq[i];
            nodes[temp[i].place].place = i;
        }
        int s = temp[0].value;

        // compute
        int cost = 0;
        for(int i = 0; i < m; i++) {
            int j = nodes[i].place;
            if(j >= 0 && j != i) {
                int n = 1;
                int amin = nodes[i].value;
                int sum = nodes[i].value;
                while(j != i) {
                    int next = nodes[j].place;
                    amin = Math.min(amin, nodes[j].value);
                    sum += nodes[j].value;
                    n++;
                    nodes[j].place = -1;
                    j = next;
                }
                cost += Math.min(sum + (n - 2) * amin, sum + amin + (n + 1) * s);
            }
        }
        return cost;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(sillysort(n, a));

        sc.close();
    }
}

