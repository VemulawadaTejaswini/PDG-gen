import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<Integer>();
        while(sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a == 0 && b == 0){
                break;
            }
            numList.add(a);
            numList.add(b);
        }
        for(int i = 0; i < numList.size() / 2; i++){
            for(int j = 0; j < numList.get(i * 2); j++){
                for(int k = 0; k < numList.get(i * 2 + 1); k++){
                    if(j == 0 || j == numList.get(i * 2) - 1
                            || k == 0 || k == numList.get(i * 2 + 1) - 1){
                        System.out.print("#");
                    }else{
                        System.out.print(".");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
