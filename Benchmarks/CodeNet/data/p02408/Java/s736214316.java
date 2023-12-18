import java.util.*;

class Main {
	public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();

        String design;
        int number;
        int[] s_num = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        int[] d_num = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        int[] h_num = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        int[] c_num = {1,2,3,4,5,6,7,8,9,10,11,12,13};

        for(int i = 0;i < num;i++){
            design = sc.next();
            number = sc.nextInt();
            switch(design){
                case "S":
                    for(int j = 0;j < 13;j++){
                        if(s_num[j] == number)  s_num[j] = 0;
                    }
                    break;
                case "D":
                    for(int j = 0;j < 13;j++){
                        if(d_num[j] == number)  d_num[j] = 0;
                    }
                    break; 
                case "H":
                    for(int j = 0;j < 13;j++){
                        if(h_num[j] == number)  h_num[j] = 0;
                    }
                    break;     
                case "C":
                    for(int j = 0;j < 13;j++){
                        if(c_num[j] == number)  c_num[j] = 0;
                    }
                    break;     
            }
        }

    
        for(int i = 0;i < 4;i++){
            switch (i){
                case 0:
                    for(int j = 0;j < 13;j++){
                        if(s_num[j] != 0)   System.out.println("S "+s_num[j]);
                    }
                    break;
                case 1:
                    for(int j = 0;j < 13;j++){
                        if(h_num[j] != 0)   System.out.println("H "+h_num[j]);
                    }
                    break;
                case 2:
                    for(int j = 0;j < 13;j++){
                        if(c_num[j] != 0)   System.out.println("C "+c_num[j]);
                    }
                    break;
                case 3:
                    for(int j = 0;j < 13;j++){
                        if(d_num[j] != 0)   System.out.println("D "+d_num[j]);
                    }
                    break;
            }
        }
    }
}

