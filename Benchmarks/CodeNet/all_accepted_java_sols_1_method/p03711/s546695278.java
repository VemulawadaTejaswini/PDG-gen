import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[2];
        array[0] = scanner.nextInt();
        array[1] = scanner.nextInt();

        int[] groupA = {1,3,5,7,8,10,12};
        int[] groupB = {4,6,9,11};
        boolean isFound1 = false;
        boolean isFound2 = false;

        if(array[0] == 2 && array[1] == 2) {
            isFound1 = true;
            isFound2 = true;
        } else {
            if(!isFound1 && !isFound2) {
                for(int i=0; i<groupA.length; i++) {
                    if(groupA[i] == array[0]) {
                        isFound1 = true;
                    } else if(groupA[i] == array[1]) {
                        isFound2 = true;
                    } else if(isFound1 && isFound2) {
                        break;
                    }
                }
            }
            if(!isFound1 && !isFound2) {
                for(int ii=0; ii<groupB.length; ii++) {
                    if(groupB[ii] == array[0]) {
                        isFound1 = true;
                    } else if(groupB[ii] == array[1]) {
                        isFound2 = true;
                    } else if(isFound1 && isFound2) {
                        break;
                    }
                }
            }
        }
        if(isFound1 && isFound2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
