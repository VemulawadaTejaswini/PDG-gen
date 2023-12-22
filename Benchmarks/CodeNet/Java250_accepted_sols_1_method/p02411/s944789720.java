import java.util.Scanner;
public class Main{
    public static void main(String args[]){
	Scanner in =new Scanner(System.in);

	int m,f,r;
	String grade; 
	while(true){
	    m = in.nextInt();
	    f = in.nextInt();
	    r = in.nextInt();

	    int score = m+f;
	    if(m == -1 && f == -1 && r == -1)break;

	    if(m == -1 || f == -1)grade = "F";
	    else if(score >= 80)grade = "A";
	    else if(score >= 65 && score<80)grade = "B";
	    else if(score >= 50 && score<65)grade = "C";
	    else if(score>=30 && score <50){
		grade = "D";
		if(r>=50)grade ="C";
	    }else grade = "F";
	    System.out.println(grade);
	}

    }
}
	
	
