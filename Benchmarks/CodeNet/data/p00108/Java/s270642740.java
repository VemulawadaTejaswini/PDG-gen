import java.util.*;

class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                while(n != 0){ 
                        sc.nextLine();
                        String[] s = sc.nextLine().split(" ");
                        int[] a = new int[n];
                        for(int i = 0 ; i < n ; i++){
                                a[i] = Integer.parseInt(s[i]);
                        }   
                        int counter = 0;
                        int[] b = nexta(a);
                        while(!Arrays.equals(a,b)){
                                counter++;
                                a = b;
                                b = nexta(a);
                        }   
                        System.out.println(counter);
                        print(b);
                        n = sc.nextInt();
                }   
        }   
        static int freq(int m, int[] a){
                int tmp = 0;
                for(int i = 0 ; i < a.length ; i++){
                        if(a[i] == m){ 
                                tmp++;
                        }   
                }   
                return tmp;
        }   
        static int[] nexta(int[] a){
                int[] tmp = new int[a.length];
                for(int i = 0 ; i < a.length ; i++){
                        tmp[i] = freq(a[i], a); 
                }   
                return tmp;
        }   
        static void print(int[] a){
                for(int i = 0 ; i < a.length-1 ; i++){
                        System.out.print(a[i] + " ");
                }   
                System.out.println(a[a.length-1]);
        }   
}