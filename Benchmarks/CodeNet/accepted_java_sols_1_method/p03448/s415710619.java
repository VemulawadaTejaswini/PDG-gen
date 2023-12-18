import java.util.Scanner;  
class Main 
{
  public static void main(String[] args) 
  {
    Scanner input=new Scanner(System.in);
    int a500=input.nextInt();
    int a100=input.nextInt();
    int a50=input.nextInt();
    int money=input.nextInt();
    int count=0;
    //case1
    int temp=0;
    for(int i=1;i<=a50;i++)
    {
      temp=temp+50;
      if(temp==money)
      {
        count++;
        break;
      }
    }
    //case2
    temp=0;
    for(int i=1;i<=a100;i++)
    {
      temp=temp+100;
      if(temp==money)
      {
        count++;
        break;
      }
    }
    //case3
    temp=0;
    for(int i=1;i<=a500;i++)
    {
      temp=temp+500;
      if(temp==money)
      {
        count++;
        break;
      }
    }
    //listing50
    temp=0;
    int[] list50=new int[a50];
    for(int i=0;i<a50;i++)
    {
     temp=temp+50;
     list50[i]=temp;
    }
    //listing100
    temp=0;
    int[] list100=new int[a100];
    for(int i=0;i<a100;i++)
    {
     temp=temp+100;
     list100[i]=temp;
    }
    //listing500
    temp=0;
    int[] list500=new int[a500];
    for(int i=0;i<a500;i++)
    {
     temp=temp+500;
     list500[i]=temp;
    }
    //case4  50_100
    temp=0;
    for(int i=0;i<a50;i++)
    {
      for(int k=0;k<a100;k++)
      {
      temp=list50[i]+list100[k];
      if(temp==money)
      {
        count++;
      }
      }
    }
    //case5  50_500
    temp=0;
    for(int i=0;i<a50;i++)
    {
      for(int k=0;k<a500;k++)
      {
      temp=list50[i]+list500[k];
      if(temp==money)
      {
        count++;
      }
      }
    }
    //case6  100_500
    temp=0;
    for(int i=0;i<a100;i++)
    {
      for(int k=0;k<a500;k++)
      {
      temp=list100[i]+list500[k];
      if(temp==money)
      {
        count++;
      }
      }
    }
    //case7  50_100_500
    temp=0;
    for(int i=0;i<a50;i++)
    {
      for(int k=0;k<a100;k++)
      {
        for(int l=0;l<a500;l++)
        {
         temp=list50[i]+list100[k]+list500[l];
         if(temp==money)
          {
            count++;
          }
        }
      }
    }
    System.out.println(count);
  }
}