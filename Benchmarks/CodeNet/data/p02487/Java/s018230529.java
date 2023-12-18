import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int h = scan.nextInt();
            int w = scan.nextInt();
            if(h == 0 && w == 0){
            	break;
            }
            String str = "";
            for(int i = 0;i < h;i++){
            	for(int j = 0;j < w;j++){
            		if(i == 0 || i == h-1 || j == 0 || j == w-1){
            			str += "#";
            		}else{
            			str += ".";
            		}
            	}
            	str += "\n";
            }
            System.out.println(str);
        }
    }
}