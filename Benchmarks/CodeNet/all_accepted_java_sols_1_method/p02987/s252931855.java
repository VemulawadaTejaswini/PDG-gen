import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String[] inputArr = input.split("");

        Arrays.sort(inputArr);
        if(inputArr[0].equals(inputArr[1]) && inputArr[2].equals(inputArr[3]) && !inputArr[0].equals(inputArr[2])){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}