import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int curr;
        boolean app = true;
        for(int i = 0; i < n; i++){
            curr = sc.nextInt();
            if(curr%2==0){
                if(curr%3!=0&&curr%5!=0){
                    app = false;
                    break;
                }

            }
        }
        if(app)
            System.out.println("APPROVED");
        else
            System.out.println("DENIED");
    }
}
