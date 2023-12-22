import java.util.*;
class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] nums=new int[n];
for(int i=0;i<n;i++)nums[i]=sc.nextInt();
for(int i=1;i<n;i++){
if(nums[i-1]<nums[i])nums[i]--;
else if(nums[i-1]>nums[i]){System.out.println("No");
return;}
}
System.out.println("Yes");
}}