class Main{
 
public static void main(String arg[]){
if(0<=S&S<86400){
    s=S%60;
    m=(S-s)%3600;
    h=(S-m-s)/3600;
   System.out.println(h+":"+m/60+":"+s)
}
