import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
   Scanner kbd = new Scanner(System.in);
   int[] i1 = new int[3];
   for(int n=0;n<3;n++){
     i1[n] = kbd.nextInt();
   }
   int[] i2 = new int[3];
   for(int n=0;n<3;n++){
     i2[n] = kbd.nextInt();
   }
   int[] i3 = new int[3];
   for(int n=0;n<3;n++){
     i3[n] = kbd.nextInt();
   }
   int n=kbd.nextInt();

   int[] deta = new int[n];
   for(int k=0;k<n;k++){
     deta[k] = kbd.nextInt();
   }

  for(int k=0;k<n;k++){
   for(int l=0;l<3;l++){
     if(deta[k]==i1[l]){
      i1[l]=0;
  }
 }
}
for(int k=0;k<n;k++){
 for(int l=0;l<3;l++){
   if(deta[k]==i2[l]){
    i2[l]=0;
}
}
}
for(int k=0;k<n;k++){
 for(int l=0;l<3;l++){
   if(deta[k]==i3[l]){
    i3[l]=0;
}
}
}

if(i1[0]+i1[1]+i1[2]==0||i2[0]+i2[1]+i2[2]==0||i3[0]+i3[1]+i3[2]==0
||i1[0]+i2[1]+i3[2]==0||i1[2]+i2[1]+i3[0]==0
||i1[0]+i2[0]+i3[0]==0||i1[1]+i2[1]+i3[1]==0||i1[2]+i2[2]+i3[2]==0){
  System.out.println("Yes");
}else{
  System.out.println("No");
}


 }
}