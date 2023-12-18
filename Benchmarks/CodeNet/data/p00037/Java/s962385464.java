import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String[] yoko = new String[5];
        String[] tate = new String[4];

        for(int i = 0 ; i < 5 ; i++){
        	if(i != 4){
        		yoko[i] = input.nextLine();
        		tate[i] = input.nextLine();
        	}else{
        		yoko[i] = input.nextLine();
        	}
        }
        int stx = 0;
        int sty = 0;
        char direction = 'R';
        StringBuilder sb = new StringBuilder();
        while(true){
        	if(direction == 'R'){
        		if(sty != 0 && tate[sty-1].charAt(stx) == '1'){
        			sty--;
        			direction = 'U';
        		}else if(stx != 4 && yoko[sty].charAt(stx) == '1'){
        			stx++;
        		}else if(tate[sty].charAt(stx) == '1'){
        			sty++;
        			direction = 'D';
        		}else{
        			stx--;
        			direction = 'L';
        			System.out.println("pei");
        		}
        	}else if(direction == 'L'){
        		if(sty != 0 && tate[sty-1].charAt(stx) == '1'){
        			sty--;
        			direction = 'U';
        		}else if(stx != 0 && yoko[sty].charAt(stx-1) == '1'){
        			stx--;
        		}else if(tate[sty].charAt(stx) == '1'){
        			sty++;
        			direction = 'D';
        		}else{
        			stx++;
        			direction = 'R';
        			System.out.println("pei");
        		}
        	}else if(direction == 'U'){
        		if(stx != 0 && yoko[sty].charAt(stx-1) == '1'){
            			stx--;
            			direction = 'L';
        		}else if(sty != 0 && tate[sty-1].charAt(stx) == '1'){
        			sty--;
        		}else if(yoko[sty].charAt(stx) == '1'){
        			stx++;
        			direction = 'R';
        		}else{
        			sty++;
        			direction = 'D';
        			System.out.println("pei");
        		}
        	}else if(direction == 'D'){
        		if(stx != 4 && yoko[sty].charAt(stx) == '1'){
         			stx++;
         			direction = 'R';
        		}else if(sty != 4 && tate[sty].charAt(stx) == '1'){
        			sty++;
        		}else if(stx != 0 && yoko[sty].charAt(stx-1) == '1'){
        			stx--;
        			direction = 'L';
        		}else{
        			sty--;
        			direction = 'U';
        			System.out.println("pei");
        		}
        	}
        	sb.append(direction);
        	//if(sb.length() < 20)System.out.println(sb+","+stx+","+sty);
        	if(stx == 0 && sty == 0)break;
        }
        System.out.println(sb.toString());
    }
}