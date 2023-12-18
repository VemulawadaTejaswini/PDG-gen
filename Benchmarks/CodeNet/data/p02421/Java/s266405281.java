import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int taroPoint = 0;
        int hanakoPoint = 0;
        scanner.nextLine();
        
        for(int i=1;i<=n;i++){
            String input = scanner.nextLine();
            String inputArr[] = input.split(" ");
            int check = inputArr[0].compareTo(inputArr[1]);
            if(check > 0){
                taroPoint += 3;
            } else if(check == 0){
                taroPoint += 1;
                hanakoPoint += 1;
            } else {
                hanakoPoint += 3;
            }
        }
        System.out.println(Integer.toString(taroPoint) + " " + Integer.toString(hanakoPoint));
    }
}
