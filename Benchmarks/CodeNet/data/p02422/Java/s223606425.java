import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
         
        String line;
        String[] imperative;
        int a;
        int b;
         
        str.append(scan.nextLine());
        int turns = Integer.parseInt(scan.nextLine());
         
        for (int i = 0; i < turns; i++) {
            line = scan.nextLine();
            imperative = line.split(" ");
            //imperative[1] => a?????????
            a = Integer.parseInt(imperative[1]);
            //imperative[2] => b?????????
            b = Integer.parseInt(imperative[2]) + 1;
             
            if(imperative[0].equals("print")){
                //??????=>print ???§?????????°???¨???
                System.out.println(str.substring(a, b));
            }else if(imperative[0].equals("reverse")){
                //??????=>reverse ???§?????????°
                //str???§??????¢??????????????±?????????????reverse???????????????????????????¢?????????str???????????????
                StringBuilder reverse = new StringBuilder();
                reverse.append((str.substring(a, b)));
                str.replace(a, b, (reverse.reverse()).toString());
            }else{
                //?????????print???reverse ???§???????????????????????????
                str.replace(a, b, imperative[3]);
            }
             
        }
         
    }
}
Compile Error Logs:
You are not authorized to see the message.

Status
Judge: 16/16 	JAVA 	CPU: 00.09 sec 	Memory: 21608 KB 	Length: 1347 B 	2015-05-08 17:47 	2015-05-08 17:47
Results for testcases
Case # 	Verdict 	CPU Time 	Memory 	In 	Out 	Case Name
Case #1: 	: Accepted 	00.04 sec 	17152 KB 	46 B 	5 B 	00_sample_00.in
Case #2: 	: Accepted 	00.05 sec 	17136 KB 	42 B 	8 B 	00_sample_01.in
Case #3: 	: Accepted 	00.05 sec 	17304 KB 	193 B 	67 B 	01_small_00.in
Case #4: 	: Accepted 	00.04 sec 	17168 KB 	275 B 	81 B 	01_small_01.in
Case #5: 	: Accepted 	00.05 sec 	17156 KB 	204 B 	59 B 	02_corner_00.in
Case #6: 	: Accepted 	00.05 sec 	17328 KB 	281 B 	66 B 	02_corner_01.in
Case #7: 	: Accepted 	00.05 sec 	17132 KB 	60 B 	6 B 	02_corner_02.in
Case #8: 	: Accepted 	00.05 sec 	17156 KB 	142 B 	15 B 	02_corner_03.in
Case #9: 	: Accepted 	00.05 sec 	17136 KB 	143 B 	10 B 	03_rand_00.in
Case #10: 	: Accepted 	00.04 sec 	17160 KB 	214 B 	26 B 	03_rand_01.in
Case #11: 	: Accepted 	00.05 sec 	17228 KB 	539 B 	94 B 	03_rand_02.in
Case #12: 	: Accepted 	00.05 sec 	17436 KB 	842 B 	134 B 	03_rand_03.in
Case #13: 	: Accepted 	00.05 sec 	17332 KB 	2175 B 	1497 B 	04_large_00.in
Case #14: 	: Accepted 	00.06 sec 	17448 KB 	3997 B 	1552 B 	04_large_01.in
Case #15: 	: Accepted 	00.05 sec 	15404 KB 	3817 B 	2931 B 	05_maximum_00.in
Case #16: 	: Accepted 	00.09 sec 	21608 KB 	17929 B 	8145 B 	05_maximum_01.in
< prev | 	1 	/ 	16 	| next > 	  		 : Accepted        00.04 sec        17152 KB
 
Judge Input #1 ( in1.txt | 46 B) 		Judge Output #1 ( out1.txt | 5 B)

abcde
3
replace 1 3 xyz
reverse 0 2
print 1 4

		

xaze

Comments
 
 Under Construction.
 
Categories
 
 
Free Tags
 
 
 
	   	
 

Aizu Online Judge
follow us on Twitter

About us

ContactSystem InfoThe University of AizuUniv. of Aizu Competitive Programming Club
Tools

WEB Board ToolsVirtual ArenaAPI ReferenceTutorial
Links

ACM/ICPCACM/ICPC Asia JapanACM-ICPC OB/OG Alumni GroupPC KoshienJOI

AtCoderTopCoderCodeForces

Uva Online judgesACM-ICPC Live ArchivePKU JudgeOnline

Aizu IT Arena

Best viewed using Firefox, Google Chrome

Aizu Online Judge Version 1.0 ?? 2004 - 2016 Univ. of Aizu Competitive Programming Club (ICPCPC), Database Systems Lab. University of Aizu
 