import java.util.Scanner;
  
class Main{
  public static void main(String[] arg){

    Scanner in = new Scanner(System.in);

    String input = in.nextLine();

    while(!input.equals("-")){
        String tmp = in.nextLine();
        int h_cnt = Integer.parseInt(tmp);
        StringBuffer sb = new StringBuffer(input);
        for(int i=0; i<h_cnt; i++){
            tmp = in.nextLine();
            int h_pos = Integer.parseInt(tmp);
            String del_str = sb.substring(0,h_pos);
            sb = sb.delete(0,h_pos);
            sb.append(del_str);
        }
        System.out.println(sb.toString());
        input = in.nextLine();
    }

  }
}