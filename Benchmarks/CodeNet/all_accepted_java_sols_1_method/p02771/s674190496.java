import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array [] = new int[3];
        int count = 0, num;
        while(count<3)
        {
            num = scanner.nextInt();
            if(0<num && num <10){
                array[count] = num;
                count++;
            }

        }

        for (int i = 0; i<3; i++) {
            for(int j = i+1; j<3; j++){
                if(array[i] == array[j]){
                    count = count-1;
                }
            }
        }
        if(count == 2){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}

