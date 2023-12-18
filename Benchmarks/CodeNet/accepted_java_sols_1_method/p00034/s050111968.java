import java.util.*;

class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                while(sc.hasNext()){
                        int[] l = new int[10];
                        String[] s = sc.nextLine().split(",");
                        int total = 0;
                        for(int i = 0; i < 10; i++){
                                l[i] = Integer.parseInt(s[i]);
                                total += l[i];
                        }   
                        int v = Integer.parseInt(s[10])+Integer.parseInt(s[11]);
                        double p = Integer.parseInt(s[10])*(double)total/v;
                        for(int i = 0; i < 10 && 0 < p; i++){
                                p -= l[i];
                                if(p <= 0){ 
                                        System.out.println(++i);
                                }   
                        }   
                }   
                sc.close();
        }   
}