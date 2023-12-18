import java.util.Scanner;

class Students{
 int m=0,f=0,r=0;
 String grade="F";
}

public class Main{
 public static void main(String[] args){
  
  Scanner sc= new Scanner(System.in);
  Students[] student=new Students[100000];
   
  int i=0; 

  student[0].m=sc.nextInt();
  student[0].f=sc.nextInt();
  student[0].r=sc.nextInt();

  while(student[i].m!=-1||student[i].f!=-1||student[i].r!=-1){
    i++;
    student[i].m=sc.nextInt();
    student[i].f=sc.nextInt();
    student[i].r=sc.nextInt();
  }
  for(int j=0;j<i;j++){
    if(student[j].m+student[j].f>=80)
     student[j].grade="A";
    else if(student[j].m+student[j].f>=65)
     student[j].grade="B";
    else if(student[j].m+student[j].f>=50)
     student[j].grade="C";
    else if(student[j].m+student[j].f>=30){
     if(student[j].r>=50)
      student[j].grade="C";
     else
      student[j].grade="D";
    }
    else
     student[j].grade="F";

     System.out.println(student[j].grade);
  }
     
 }
}