/*
 * 長さ N の配列 A が与えられます。 A を何箇所かで切って、A の連続した部分であるようないくつかの数列に分けます。
 * この時、分けられたあとの数列は全て、単調非減少または単調非増加な列になっている必要があります。 最小で何個の数列に分ければ良いかを求めて下さい。
 */

import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            int n = Integer.parseInt(sc.next());
            int temp1, temp2, index = 0, count = 0;
            
            temp2 = Integer.parseInt(sc.next());
            
            while(index<n-1){
            	temp1 = temp2;
            	temp2 = Integer.parseInt(sc.next());
            	index++;
            	
            	while(index<n-1 && temp2 == temp1){
            		temp2 = Integer.parseInt(sc.next());
            		index++;
            	}
            	
            	if(temp1 < temp2){
            		while(index<n-1 && temp1 <= temp2){
            			temp1 = temp2;
            			temp2 = Integer.parseInt(sc.next());
            			index++;
            		}
            		if(index==n-1 && temp1 > temp2){
            			count++;
            		}
            	}else{
            		while(index<n-1 && temp1 >= temp2){
            			temp1 = temp2;
            			temp2 = Integer.parseInt(sc.next());
            			index++;
            		}
            		if(index==n-1 && temp1 < temp2){
            			count++;
            		}
            	}
            	count++;
            }
            
            //出力
            System.out.println(Math.max(count, 1));
            sc.close();
        }
    }
	