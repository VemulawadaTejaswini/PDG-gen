import java.util.Scanner;

class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

        while(true){
            String x = sc.nextLine();

            if(x.equals("0")){
                break;
            }

            String str[] = x.split("", 0);

            int sum = 0;

            for(int i = 0; i < str.length; i++){
                sum += Integer.parseInt(str[i]);
            }
            System.out.println(sum);
        }
    }
}
