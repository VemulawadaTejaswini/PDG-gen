import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str,num;
        long sum=0;
        while(true){
            str = scan.nextLine();
            if(str.equals("0")){
                break;
            }
            StringBuilder sb = new StringBuilder();
            for (int i=0; i<str.length(); i++) {
                char c = str.charAt(i);

                sb.append(c);
                num = sb.toString();
                sum += Long.valueOf(num);
                sb.deleteCharAt(0);
            }
            System.out.println(sum);
            sum = 0;
        }

        scan.close();
    }

}


