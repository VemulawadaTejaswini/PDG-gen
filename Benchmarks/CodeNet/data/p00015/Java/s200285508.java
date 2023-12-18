main(){
  int n,c,d,x,y,z,o=0,e;
  char p[100],q[100],r[100];
 scanf("%d",&n);
 while(n>0)
   {
     e=c=d=0;
     scanf("%s %s",p,q);
     while(p[++c]!='\0'){}
     c--;
     while(q[++d]!='\0'){}
     d--;
     //     printf("%c %c\n",p[c],q[d]);
     //     if(c>=80 )
     while(c>=0 || d>=0 || o>0)
       {
	 if(c>=0)
	   x=(int)p[c--]-'0';
	 else
	   x=0;
	 if(d>=0)
	   y=(int)q[d--]-'0';
	 else
	   y=0;
	 z=x+y+o;
	 if(z>9)
	   o=1;
	 else 
	   o=0;
	 r[e++]=(char)('0'+(z%10));

       }
     e--;
     for(;e>=0;e--)
       printf("%c",r[e]);
     printf("\n");
     n--; 
   }
 return 0;
}