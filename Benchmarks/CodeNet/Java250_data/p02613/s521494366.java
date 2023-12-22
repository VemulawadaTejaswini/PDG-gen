import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        String judge[] = {"AC","WA","TLE","RE"};
        int count[] = {0,0,0,0};

        for(int loop = 0; loop<N; loop++){
            String result = scanner.next();
            switch(result){
                case "AC":
                    count[0]++;
                    break;
                case "WA":
                    count[1]++;
                    break;
                case "TLE":
                    count[2]++;
                    break;
                case "RE":
                    count[3]++;
                    break;
                default:
                    break;
            }
        }

        for(int loop = 0; loop < 4; loop++){
            System.out.println( judge[loop] + " x " + count[loop] );
        }
    }
}