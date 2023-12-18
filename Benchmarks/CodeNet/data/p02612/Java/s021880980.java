import java.util.Scanner; 

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();

       for(int i =1; i<10 ; i++){
           if(N <= 1000*i){
               System.out.println(1000*i-N);
               break;
           }
       }
        }

    }
