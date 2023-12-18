import java.util.Scanner;

class Main{
  public static void main(String[] arg){

    Scanner in = new Scanner(System.in);

    String input = in.nextLine();
    StringBuffer sb = new StringBuffer(input);

    String tmp = in.nextLine();
    int cmd_cnt = Integer.parseInt(tmp);

    for(int i=0; i<cmd_cnt; i++){
        input = in.nextLine();
        String [] command_line = input.split(" ", 0);
        String command = command_line[0];
        int start = Integer.parseInt(command_line[1]);
        int end = Integer.parseInt(command_line[2]);

        if(command.equals("print")){
            System.out.println(sb.substring(start, end+1));
        }else if(command.equals("reverse")){
            // debug System.out.println("reverse!!!");
            String rev_str = sb.substring(start, end+1);
            StringBuffer tmp_rev = new StringBuffer(rev_str);
            rev_str = tmp_rev.reverse().toString();
            sb.replace(start, end+1, rev_str);
        }else if(command.equals("replace")){
            String rep_str = command_line[3];
            sb.replace(start, end+1, rep_str);
        }
    }
  }
}