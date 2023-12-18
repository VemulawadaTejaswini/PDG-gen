import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String data;
        String[] cmd;
        int count, j = 0, from, to;

        try {
            data = br.readLine();
            count = Integer.parseInt(br.readLine());
            sb.append(data);
            while (count-- > 0) {
                cmd = br.readLine().split(" ");
                from = Integer.parseInt(cmd[1]);
                to = Integer.parseInt(cmd[2]);
                // logic
                // print a b print from a to b
                // reverse a b reverse charter from a to b
                // replace a b c replace charecter from a to b as c
                if (cmd[0].equals("print")) {
                    System.out.println(sb.substring(from, to + 1));
                    continue;
                } else if (cmd[0].equals("reverse")) {
                    rev(sb, from, to);
                    continue;
                } else if (cmd[0].equals("replace")) {
                    for (int i = from; i <= to; i++) {
                        sb.setCharAt(i, cmd[3].charAt(j++));
                    }
                    j = 0;
                    continue;
                } else {
                    return;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

   public static void rev(StringBuilder data, int from, int to) {
        char tmp;

        for (int i = 0; i < (to - from + 1) / 2; i++) {
			tmp = data.charAt(from + i);
			data.setCharAt(from + i , data.charAt(to - i));
			data.setCharAt(to - i, tmp);
			/*
			tmp = data.charAt(from);
            data.setCharAt(i, data.charAt(to));
            data.setCharAt(to--, tmp);
			*/
        }
    }
}

