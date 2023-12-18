#include<bits/stdc++.h>
using namespace std;

struct CWW{
    CWW(){
        cin.tie(0);
        ios_base::sync_with_stdio(0);
        cout<<fixed<<setprecision(15);
    }
}STAR;

using D=double;

const D EPS=1e-8;
const D INF=1e9;

const int COUNTER_CLOCKWISE=1;
const int CLOCKWISE=-1;
const int ONLINE_FRONT=2;
const int ONLINE_BACK=-2;
const int ON_SEGMENT=0;

using Point=complex<D>;

struct Segment{
    Point p1,p2;
    Segment(const Point &p1=Point(),const Point &p2=Point()):p1(p1),p2(p2){}
};

struct Line{
    Point p1,p2;
    Line(const Point &p1=Point(),const Point &p2=Point()):p1(p1),p2(p2){}
};

struct Circle{
    Point c;
    D r;
    Circle(const Point &c=Point(),const D &r=0.0):c(c),r(r){}
};

using Polygon=vector<Point>;

#define EQ(a,b) (abs((a)-(b))<EPS)

istream& operator>>(istream &is,Point &a){
    D x,y;
    is>>x>>y;
    a=Point(x,y);
    return is;
}

ostream& operator<<(ostream& os,const Point &a){
    os<<real(a)<<" "<<imag(a);
    return os;
}

istream& operator>>(istream &is,Line &l){
    Point p1,p2;
    is>>p1>>p2;
    l=Line(p1,p2);
    return is;
}

istream& operator>>(istream &is,Segment &s){
    Point p1,p2;
    is>>p1>>p2;
    s=Segment(p1,p2);
    return is;
}

D dot(const Point &a,const Point &b){
    return real(a)*real(b)+imag(a)*imag(b);
}

D cross(const Point &a,const Point &b){
    return real(a)*imag(b)-imag(a)*real(b);
}

Point projection(const Point &a,const Point &b){
    return a*real(b/a);
}

Point projection(const Line &l,const Point &a){
    return l.p1+projection(l.p2-l.p1,a-l.p1);
}

Point reflection(const Line &l,const Point &a){
    Point p=projection(l,a);
    return 2.0*p-a;
}

int ccw(Point a,Point b,Point c){
    b-=a;c-=a;
    if(cross(b,c)>EPS)return COUNTER_CLOCKWISE;
    if(cross(b,c)<-EPS)return CLOCKWISE;
    if(dot(b,c)<-EPS)return ONLINE_BACK;
    if(norm(b)+EPS<norm(c))return ONLINE_FRONT;
    return ON_SEGMENT;
}

bool isOrthogonal(const Point &a,const Point &b){
    return EQ(dot(a,b),0.0);
}

bool isOrthogonal(const Point &a1,const Point &a2,const Point &b1,const Point &b2){
    return isOrthogonal(a2-a1,b2-b1);
}

bool isOrthogonal(const Line &l,const Line &m){
    return isOrthogonal(l.p1,l.p2,m.p1,m.p2);
}

bool isParallel(const Point &a,const Point &b){
    return EQ(cross(a,b),0.0);
}

bool isParallel(const Point &a1,const Point &a2,const Point &b1,const Point &b2){
    return isParallel(a1-a2,b1-b2);
}

bool isParallel(const Line &l,const Line &m){
    return isParallel(l.p1,l.p2,m.p1,m.p2);
}

bool intersect(const Point &a1,const Point &a2,const Point &b1,const Point &b2){
    return ccw(a1,a2,b1)*ccw(a1,a2,b2)<=0&&
            ccw(b1,b2,a1)*ccw(b1,b2,a2)<=0;
}

bool intersect(Segment &s,Segment &t){
    return intersect(s.p1,s.p2,t.p1,t.p2);
}

Point crossPoint(const Segment &s1,const Segment &s2){
    Point  base=s2.p2-s2.p1;
    D d1=abs(cross(base,s1.p1-s2.p1));
    D d2=abs(cross(base,s1.p2-s2.p1));

    D t=d1/(d1+d2);
    return s1.p1+(s1.p2-s1.p1)*t;
}



int main(){
    int Q;cin>>Q;
    while(Q--){
        Segment s,t;
    cin>>s>>t;
    cout<<crossPoint(s,t)<<endl;
    }
    return 0;
}