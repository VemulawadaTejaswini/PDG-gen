import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int keta = sc.nextInt();

        int sum = 0;
        int starcount_odd = 0;
        int starcount_even = 0;
        int nnn;

        String id = sc.next();
        if(keta%2!=0){
            keta++;
            id = "0" + id;
        }

        /*

        if(keta%2!=0){
        	ch = sc.nextchar();
        	if(ch == '*'){
        		starcount_odd++;
        	}else{
        		sum += (int)ch;
        	}
        }
        */
        // System.out.println(id);

        for(int i = 0; i < keta; i++){
        	if(i%2==0){
        		if(id.substring(i,i+1).equals("*")){
        			starcount_even++;
        		}else{
        			nnn = 2 * Integer.parseInt(id.substring(i,i+1));
                    // System.out.println(nnn);
        			if(nnn >= 10){
        				sum += nnn - 9;
        			}else{
        				sum += nnn;
        			}
        		}
        	}else{
        		if(id.substring(i,i+1).equals("*")){
        			starcount_odd++;
        		}else{
        			sum += Integer.parseInt(id.substring(i,i+1));
                    // System.out.println(Integer.parseInt(ch));                 
        		}
        	}
            // System.out.println("sum=" + sum);
        }

/*
        System.out.println(starcount_odd);
        System.out.println(starcount_even);
        System.out.println(sum);
*/
        int allstar = starcount_even+starcount_odd;
        int[] tryArray = new int[allstar];

        int k =sc.nextInt();
        int[] kouho = new int[k];
        for(int i = 0; i < k; i++){
        	kouho[i] = sc.nextInt();
        }

//how we have to try
        int allnum = 1;
        for(int i = 0; i < allstar; i++){
        	allnum *= k;
        }

        // System.out.println("allnum=" + allnum);

        int nowcheck = 0;
        int nokori = 10 - sum % 10;
        if(nokori==10){
            nokori = 0;
        }

        int answer = 0;
        int sub_i;

        for(int i = 0; i < allnum; i++){
        	sub_i = i;
        	nowcheck = 0;
        	for(int j = 0; j < allstar; j++){
        		tryArray[j] = kouho[sub_i % k];
        		sub_i /= k;
        	}
        	for(int j = 0; j < allstar; j++){
        		if(j < starcount_odd){
        			nowcheck += tryArray[j];
        		}else{
        			if(tryArray[j] < 5){
        				nowcheck += tryArray[j] * 2;
        			}else{
        				nowcheck += tryArray[j] * 2 - 9;
        			}
        		}
        	}
        	if(nowcheck%10 == nokori){
        		answer++;
        	}
        }

        System.out.println(answer);
    }
}