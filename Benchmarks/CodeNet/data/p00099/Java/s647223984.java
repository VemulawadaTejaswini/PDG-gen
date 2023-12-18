package no100.volume0;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Main {
	private static class Player {
		private int count = 0;
		private static int championNum = 0; // ?????£????????????????????¬???????????????
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line;
		String[] splitedLine;

		line = br.readLine();
		splitedLine = line.split(" ");
		final int PLAYER_SIZE = Integer.parseInt(splitedLine[0] + 1);
		final int EVENT_SIZE = Integer.parseInt(splitedLine[1]);

		Player[] player = new Player[PLAYER_SIZE];
		for (int i = 0; i < PLAYER_SIZE; i++) {
			player[i] = new Player();
		}

		// ??????????????????
		for (int i = 0; i < EVENT_SIZE; i++) {
			line = br.readLine();
			handlesEvent(line, player); // ?????£????????????????????????????????????
			searchesChampion(player); // ?????£?????????????????¢???
			printChamp(player[Player.championNum]); // ?????£????????????????????±???????????????
		}
	}

	private static void printChamp(Player champion) {
		int championNum = Player.championNum;
		int championCount = champion.count;
		System.out.println(String.format("%d %d", championNum, championCount));
	}


	private static void searchesChampion(Player[] player) {
		for (int i = 0; i < player.length; i++) {
			if (player[i].count > player[Player.championNum].count)
				Player.championNum = i;
		}
	}

	private static void handlesEvent(String line, Player[] player) {
		String[] splitedLine = line.split(" ");
		int playerNum = Integer.parseInt(splitedLine[0]);
		int eventNum = Integer.parseInt(splitedLine[1]);
		player[playerNum].count += eventNum;
	}
}