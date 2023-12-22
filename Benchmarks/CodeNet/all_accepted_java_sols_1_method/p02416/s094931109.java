import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int cnt=0;
        int length;
        int a;
        int i;
        int[] num;
        num = new int[1000];
        while(true){
            String line = sc.nextLine();
            if(line.equals("0")){
                break;
            }
            length = line.length();
            num[cnt] = 0;
            for(i=0; i<length; i++){
                a = Character.getNumericValue(line.charAt(i));
                num[cnt] += a;
            }
            cnt++;
        }
        for(i=0; i<cnt; i++){
            System.out.println(num[i]);
        }

        sc.close();
    }
}
