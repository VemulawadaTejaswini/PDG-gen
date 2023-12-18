import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // input N H1 H2 ... HN
        Scanner sc = new Scanner(System.in);
        int numNum = sc.nextInt();
        int tempNum = 0;
        int tempMax = sc.nextInt();
        String result = "Yes";
        for(int i = 1; i < numNum; i++){
            tempNum = sc.nextInt();
            if(tempNum < tempMax - 1){
                result = "No";
                break;
            } else if(tempMax < tempNum){
                tempMax = tempNum;
            }
        }
        System.out.println(result);
    }
}
