import java.util.*;

class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int w = sc.nextInt();
                while(w >= 0){ 
                        System.out.println(4280-charge(w));
                        w = sc.nextInt();
                }   
                sc.close();
        }   
        static int charge(int w){
                int charge = 0;
                if(w > 30){
                        charge += 160*(w-30);
                        w = 30; 
                }   
                if(w > 20){
                        charge += 140*(w-20);
                        w = 20; 
                }   
                if(w > 10){
                        charge += 125*(w-10);
                        w = 10; 
                }   
                return charge + 1150;
        }   
}