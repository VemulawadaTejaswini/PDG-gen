import java.util.Scanner;

public class Main{
 public static void main(String[] args){
  
  Scanner sc= new Scanner(System.in);
  int[] m =new int[10000];
  int[] f =new int[10000];
  int[] r =new int[10000];
  String[] grade =new String[10000];
   
  int i=0; 

 /*Use do-while because 1st data-set must scan*/
 do {
    m[i]=sc.nextInt();
    f[i]=sc.nextInt();
    r[i]=sc.nextInt();
    i++;
  }while(m[i-1]!=-1||f[i-1]!=-1||r[i-1]!=-1); 
                         //Repeat until the last score(m,f,r)=(0,0,0)

  /*Grading each of the students & output their grade*/
  for(int j=0;j<i;j++){
    if(m[j]==-1||f[j]==-1)
     grade[j]="F";
    else{
     if(m[j]+f[j]>=80)
      grade[j]="A";
     else if(m[j]+f[j]>=65)
      grade[j]="B";
     else if(m[j]+f[j]>=50)
      grade[j]="C";
     else if(m[j]+f[j]>=30){
      if(r[j]>=50)
       grade[j]="C";
      else
       grade[j]="D";
     }
     else
      grade[j]="F";
   }
     System.out.println(grade[j]);
  }
 }
}