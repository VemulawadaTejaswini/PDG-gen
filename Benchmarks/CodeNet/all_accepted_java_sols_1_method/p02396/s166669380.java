import java.util.Scanner;                                                               
 
class Main {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String str = new String();
            StringBuilder sb = new StringBuilder();
            int i =0 ;
            while(in.hasNext()) {
                        String buf = in.nextLine();
                    i++;
                    int j = Integer.parseInt(buf);
                    if (j == 0){
                    break;
                    }else{
                    sb.append("Case" + " " + i  + ":" + " " +  buf + "\n");
                    }

                    }
            System.out.print(sb);
        }
}