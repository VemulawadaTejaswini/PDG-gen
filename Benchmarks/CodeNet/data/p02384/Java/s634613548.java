

import java.util.Scanner;

class Main {
  public static void main(String[] args){
	  Scanner s=new Scanner(System.in);
	  int a[]={s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt()};
	  int q=s.nextInt();	
	  int qp[]=new int[2*q];
	  for(int i=0;i<2*q;i++){
		  qp[i]=s.nextInt();
	  }
	  s.close();
	  Dicelabel d=new Dicelabel(a[0],a[3],a[2],a[4],a[1],a[5]);
	  
	  for(int i=0;i<2*q;i++){
	  System.out.println(d.eNumberPrint(qp[i++],qp[i],d));
	  d.number=a[0];
  	  d.eroll=a[3];
  	  d.wroll=a[2];
  	  d.sroll=a[4];
  	  d.nroll=a[1];
  	  d.under=a[5];
	  }
  }
}
  class Dicelabel{
		int number;
	    int eroll;
	    int wroll;
	    int nroll;
	    int sroll;
	    int under;
	    Dicelabel(int number,int e,int w,int s,int n,int under){
	    	this.number=number;
	    	this.eroll=e;
	    	this.wroll=w;
	    	this.sroll=s;
	    	this.nroll=n;
	    	this.under=under;
	    }
		
		Dicelabel diceRoll(char direction){
			if(direction=='E'){
				return new Dicelabel(eroll,under,number,sroll,nroll,wroll);
			}
			if(direction=='W'){
				return new Dicelabel(wroll,number,under,sroll,nroll,eroll);
			}
			if(direction=='S'){
				return new Dicelabel(sroll,eroll,wroll,under,number,nroll);
			}
			if(direction=='N'){
				return new Dicelabel(nroll,eroll,wroll,number,under,sroll);
			}
			return null;
		}
		int eNumberPrint(int t,int b,Dicelabel d){
			//*??????eroll??§??????nroll?????????number?????????
		   for(int i=0;i<4;i++){
			   if(d.eroll==t)
				   break;
			   d=d.diceRoll('W');
		   }
		   for(int i=0;i<4;i++){
			   if(d.nroll==b)
				   break;
			   d=d.diceRoll('S');
		   }
		   return d.number;
		   
		   
		}
  }