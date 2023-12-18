int n = null;
int i = mull;
x = 1000*i;

while(n > x){
  i = i + 1;
  x = 1000*i;
}

int j = x % n ;
System.out.print(j);