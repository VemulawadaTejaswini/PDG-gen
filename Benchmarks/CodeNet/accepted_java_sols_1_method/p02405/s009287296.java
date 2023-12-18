import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int h = sc.nextInt();
            int w = sc.nextInt();
            String pushs = "";
            
            if(h == 0 && w == 0){
                break;
            } else{
                for(int i = 0; i < h; i++){
                    pushs = "";
                    for(int j = 0; j < w; j++){
                        if((i+j)%2 == 0){
                            pushs += "#";
                        } else {
                            pushs +=".";
                        }
                    }
                    System.out.println(pushs);
                }
                System.out.println("");
            }
        }
    }
}

