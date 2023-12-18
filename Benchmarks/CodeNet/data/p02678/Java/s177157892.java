package test;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int edge = sc.nextInt();

		int[][] edgeList = new int[2][edge];
		int[] masterNodeList= new int[V];
		ArrayDeque<Integer> noticeQueue = new ArrayDeque<Integer>();

		for (int i = 0; i < edge; i++) {
			edgeList[0][i] = sc.nextInt();
			edgeList[1][i] = sc.nextInt();
		}
      
		Arrays.fill(masterNodeList, -1);
		noticeQueue.add(1);
		int target;

		while (noticeQueue.size() > 0) {
			target = noticeQueue.poll();

			for (int i = 0; i < edge; i++) {
				if (edgeList[0][i] == target && masterNodeList[edgeList[1][i] - 1] == -1) {
					noticeQueue.add(edgeList[1][i]);
					masterNodeList[edgeList[1][i] - 1] = target;
				}

				if (edgeList[1][i] == target && masterNodeList[edgeList[0][i] - 1] == -1) {
					noticeQueue.add(edgeList[0][i]);
					masterNodeList[edgeList[0][i] - 1] = target;
				}
			}
		}

		System.out.println("Yes");
		for (int i = 1; i < V; i++) {
			System.out.println(masterNodeList[i]);
		}
	}
}