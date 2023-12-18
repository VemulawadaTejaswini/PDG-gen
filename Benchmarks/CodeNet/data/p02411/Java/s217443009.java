import java.util.*;
 
public class Main{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            while(true){
                int m = sc.nextInt(), f = sc.nextInt(), r = sc.nextInt();
                if(m == -1 && f == -1 && r == -1){
                    break;
                }
                if(m == -1 || f == -1){
                    System.out.println("F");
                }else if(m + f >= 80){
                    System.out.println("A");
                }else if(m + f >= 65){
                    System.out.println("B");
                }else if(m + f >= 50){
                    System.out.println("C");
                }else if(m + f >= 30){
                    if(r >= 50){
                        System.out.println("C");
                    }else{
                        System.out.println("D");
                    }
                }else{
                    System.out.println("F");
                }
            }
        }
    }
}

Compile Error Logs:

ステータス
Judge: 4/4	JAVA	CPU: 00:06 sec	Memory: 26052 KB	Length: 676 B	2017-07-14 20:43
テストケースの判定結果
Case #	Verdict	CPU Time	Memory	In	Out	Case Name
Case #1	: Accepted	00:05	25600	34	6	testcase_00
Case #2	: Accepted	00:05	25888	63	12	testcase_01
Case #3	: Accepted	00:06	25876	54	10	testcase_02
Case #4	: Accepted	00:06	26052	401	90	testcase_03

< prev |		/		| next >	 		
 
Judge Input #  ( | )		Judge Output #  ( | )

