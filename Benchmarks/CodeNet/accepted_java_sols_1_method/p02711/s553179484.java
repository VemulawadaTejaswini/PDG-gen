    import java.util.*;

    class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String[] n = sc.next().split("");
            for(int i=0;i<n.length; i++){
                if(n[i].equals("7")){
                    System.out.println("Yes");
                    return;
                }
            }
            System.out.println("No");

        }
    }