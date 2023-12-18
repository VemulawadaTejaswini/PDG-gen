import java.util.Scanner;;
    public class Main{
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            String S = sc.nextLine();
            String[] data = S.split(" ");  // [Anna, Ken, Mike]
            System.out.println(data[1]+data[0]);
        }  
    }