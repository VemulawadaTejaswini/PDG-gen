import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int year = 0, month = 0, day = 0;
        for(int i=0; i<n; i++){
            int result = 0;

            year = scan.nextInt();
            month = scan.nextInt();
            day = scan.nextInt();


            for(int m = month; m<=10; m++){
                if(m==month) {
                    if (month % 2 == 1 || year % 3 == 0) {
                        result += 20 - day + 1;
                    } else {
                        result += 19 - day + 1;
                    }
                } else if(m%2==1 || year%3 == 0){
                    result += 20;
                } else{
                    result += 19;
                }
            }

            for(int y = year+1; y<1000; y++){
                for(int m = 1; m<=10; m++){
                    if(m%2==1 || y%3 == 0){
                        result += 20;
                    } else{
                        result += 19;
                    }
                }
            }
            System.out.println(result);
        }
    }
}