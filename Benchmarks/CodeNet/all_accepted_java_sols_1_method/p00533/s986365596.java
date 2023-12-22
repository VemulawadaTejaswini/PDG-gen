import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, k;
        int h, w;
        h = sc.nextInt();
        w = sc.nextInt();
        char[][] weather = new char [h][w];
        int[][] cloud = new int [h][w];
        for(i = 0; i < h; i++){
                weather[i]= sc.next().toCharArray();
        }
        for(i = 0; i < h; i++){
        	int minutes = -1;
        	for(k = 0; k < w; k++){
        		if(weather[i][k] == 'c'){		//??????????????°????????????
        			minutes = 0;
        			cloud[i][k] = minutes;
        			minutes++;
        		}else if(minutes >= 0){		//??????????????°??????????????????????????????????????????
        			cloud[i][k] = minutes;
        			minutes++;
        		}else{		//????????\??????
        			cloud[i][k] = minutes;
        		}
        	}
        }
        for(i = 0; i < h; i++){
        	for(k = 0; k < w; k++){
        		if(k == w - 1){
        			System.out.print(cloud[i][k]);
        		}else{
        			System.out.print(cloud[i][k] + " ");
        		}
        	}
        	System.out.println();
        }
    }
}