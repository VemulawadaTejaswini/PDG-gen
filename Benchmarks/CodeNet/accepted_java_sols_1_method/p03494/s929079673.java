import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArray = new int[scanner.nextInt()];

        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = scanner.nextInt();
        }

        int count = -1;
        boolean flg = true;
        while (flg) {
            count++;
            for(int i=0;i<numArray.length;i++){
                if(numArray[i]%2==1){
                    flg=false;
                    break;
                }else{
                    numArray[i]/=2;
                }
            }
        }

        System.out.println(count);
    }
}