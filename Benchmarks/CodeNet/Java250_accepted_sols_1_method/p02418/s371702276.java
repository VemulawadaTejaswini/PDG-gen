import java.util.*;

class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

        String text1 = sc.next();

        String text2 = sc.next();

        String[] ring = text1.split("", 0);

        String[] belt = text2.split("", 0);

        boolean check = false;
        for(int i = 0; i < ring.length; i++){
            if(belt[0].equals(ring[i])){
                int ring_check = i + 1;
                int count = 1;
                for(int j = 1; j < belt.length; j++){
                    if(ring_check >= ring.length){
                        ring_check = 0;
                    }
                    if(belt[j].equals(ring[ring_check])){
                        count++;
                        ring_check++;
                    }else{
                        break;
                    }
                }
                if(count == belt.length){
                    check = true;
                }
            }
        }
        if(check){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
