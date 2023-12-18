

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m_size = Integer.parseInt(scan.nextLine());
		String[][] mount = new String[m_size][100];
		int m_num = 0;
		String block = null;
		while (scan.hasNext()) {
			String[] cmd = scan.nextLine().split(" ");
			if (cmd[0].equals("quit")) {
				break;
			} else if (cmd[0].equals("push")) {
				m_num = Integer.parseInt(cmd[1]) - 1;
				block = cmd[2];
				mount[m_num][searchindex(mount, m_num) + 1] = block;
			} else if (cmd[0].equals("pop")) {
				m_num = Integer.parseInt(cmd[1]) - 1;
				String out = mount[m_num][searchindex(mount, m_num)];
				mount[m_num][searchindex(mount, m_num)] = null;
				System.out.println(out);
			} else if (cmd[0].equals("move")) {
				m_num = Integer.parseInt(cmd[1]) - 1;
				String temp = mount[m_num][searchindex(mount, m_num)];
				mount[m_num][searchindex(mount, m_num)] = null;
				m_num = Integer.parseInt(cmd[2]) - 1;
				mount[m_num][searchindex(mount, m_num) + 1] = temp;
			} else {
				System.out.println("Error");
				break;
			}
		}

	}

	public static int searchindex(String[][] mount, int m_num) {
		int index = 0;
		for (int i = 0; i < 1000; i++) {
			if (null == mount[m_num][i]) {
				index = i - 1;
				break;
			}
		}
		return index;
	}
}