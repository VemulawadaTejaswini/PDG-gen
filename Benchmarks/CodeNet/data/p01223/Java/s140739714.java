import java.util.*;

class Main{
        public static void main(String[] args){
                        Scanner sc = new Scanner(System.in);
                        int n = sc.nextInt();
                        for(int i = 0 ; i < n ; i++){
                                        int t = sc.nextInt();
                                        int up = 0;
                                        int down = 0;
                                        int height = sc.nextInt();
                                        for(int j = 0 ; j < t-1 ; j++){
                                                int nextheight = sc.nextInt();
                                                int difference = nextheight-height;
                                                up = (difference > up) ? difference:up;
                                                down = (difference < down) ? difference:down;
                                                height = nextheight;
                                        }   
                                        System.out.println(up + " " + (-down));
                        }   
                        sc.close();
        }   

}