import java.util.*;

class Point{
  private long i;
  private long j;
  
  Point(long i,long j){
    this.i=i;
    this.j=j;
  }

  public long getter(){
    return (this.i+this.j-2);
  }
}

class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    long N=scan.nextLong();
    int k=0;
    Point[] points=new Point[10*10*10*10*10*10];
    for(long i=1;i<=(N/i);i++){
      if(N%i==0){
        long j=N/i;
        points[k++]=new Point(i,j);
      }
    }
    long min=points[0].getter();
    for(int i=0;i<k;i++){
      if(min>points[i].getter()){
        min=points[i].getter();
      }
    }
   System.out.println(min); 
  }
}