import java.util.*;

class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                while(sc.hasNext()){
                        String[] s = sc.nextLine().split(",");
                        int[] c = new int[5];
                        for(int i = 0; i < 5; i++){
                                c[i] = Integer.parseInt(s[i]);
                        }   
                        Arrays.sort(c);
                        if(c[0] == c[3] || c[1] == c[4]){
                                System.out.println("four card");
                        }else if((c[0] == c[1] && c[2] == c[4]) || (c[0] == c[2] && c[3] == c[4])){
                                System.out.println("full house");
                        }else{
                                boolean flag = true;
                                for(int i = 0; i < 4; i++){
                                        flag &= c[i]+1 == c[i+1];
                                }   
                                if(flag || Arrays.equals(c, new int[]{1,10,11,12,13})){
                                        System.out.println("straight");
                                }else if(c[0] == c[2] || c[1] == c[3] || c[2] == c[4]){
                                        System.out.println("three card");
                                }else{

                                        int kinds = 1;
                                        for(int i = 0; i < 4; i++){
                                                if(c[i] != c[i+1])kinds++;
                                        }   
                                        if(kinds == 5){ 
                                                System.out.println("null");
                                        }else if(kinds == 4){ 
                                                System.out.println("one pair");
                                        }else if(kinds == 3){ 
                                                System.out.println("two pair");
                                        }   
                                }   
                        }   

                }   
                sc.close();
        }   
}