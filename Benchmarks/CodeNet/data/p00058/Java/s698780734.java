#include<stdio.h>
int main(){
    double ax,ay,bx,by,cx,cy,dx,dy;
    double abx,aby,cdx,cdy;
    for(;scanf("%lf %lf %lf %lf %lf %lf %lf %lf",&ax,&ay,&bx,&by,&cx,&cy,&dx,&dy)!=EOF;){
        abx=bx-ax;aby=by-ay;
        cdx=dx-cx;cdy=dy-cy;
        if(abx*cdx+aby*cdy==0)printf("YES\n");
        else printf("NO\n");
    }
    return 0;
}