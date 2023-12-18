import java.util.Scanner;

class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        String str = "";
        for (int i = 1; i <= n; i++){
            if( (i % 3 == 0) || (i % 10 == 3)){
                str += " " + Integer.toString(i);
            } else {
                int tmp = i;
                while (tmp > 0){
                    tmp /= 10;
                    if(tmp != 0 && (tmp % 10 == 3) ){
                        str += " " + Integer.toString(i);
                        break;
                    }
                }
            }
        }
        System.out.println(str);
    }
}
