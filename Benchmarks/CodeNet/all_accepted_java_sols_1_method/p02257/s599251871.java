import java.util.*;
class Main {
    public static void main(String...args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        boolean isPrime;
        while(scan.hasNext() ) {
           isPrime = true;
           int primeNum = scan.nextInt();
           
           switch(primeNum) {
               case 1 :
                          isPrime = true;
               break;
                case 2 :
                          isPrime = true;
               break;
               default:
               if(primeNum % 2 == 0){
                   isPrime = false;
               } else {
                   int rootNum = (int)Math.sqrt(primeNum);
                   boolean flag = true;
                   while(flag && rootNum > 1) {
                       isPrime = true;
                       if(primeNum % rootNum== 0){
                           isPrime = false;
                           flag = false;
                        }else{
                            rootNum--;
                        }
                    }
               }
            }
            if(isPrime) {
                count++;
            }
        }
        System.out.println(count);
    }
}
